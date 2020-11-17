import pygame
import sys
import random
import time

pygame.init()

#defining pygame colours
white = (255,255,255)
black = (0,0,0)
red = (255,0,0)
grey = (192,192,192)

#defining size of game window 
window_width = 800
window_hieght = 600

# intializing a variable to the game screen
gamedisplay = pygame.display.set_mode((window_width,window_hieght))

#intialiazing a cption of the game wondow
pygame.display.set_caption("SNAKE")

clock = pygame.time.Clock()
Scores = 0


blocksize = 20
nopixel = 0

def myquit():
    pygame.QUIT
    sys.exit(0)


font = pygame.font.SysFont(None, 25, bold=True)

def drawGrid():

	sizeGrd = window_width // blockSize

def snake(blockSize, snakelist):
 
    #x = 250 - (segment_width + segment_margin) * i

    for size in snakelist:

        pygame.draw.rect(gamedisplay, black,[size[0]+5,size[1],blockSize,blockSize],2)

def mode(msg,color):
    screen_text = font.render(msg,True,color)
    gamedisplay.blit(screen_text,[window_width/2-window_width/4-window_hieght/8, window_hieght/2])


def message_to_screen(msg, color):

    screen_text = font.render(msg, True, color)

    gamedisplay.blit(screen_text, [window_width/2-window_width/4 , window_hieght/2])


def scores_to_screen(Scores):
    screen_text = font.render('Scores : {}'.format(Scores),False,red)
    gamedisplay.blit(screen_text,[0,0])


FPS = 5




#GAME LOOP
def gameloop():
    gameexit = False
    gameover = False
    starting_game = True
    show_scores = False
    #intializing snake at the middle of the window in staring
    lead_x = window_width / 2
    lead_y = window_hieght / 2

    change_pixel_of_x = 0
    change_pixel_of_y = 0

    snakelist = []
    snakeLength = 1

    randomapple_x = round(random.randrange(0,window_width-blocksize)/10.0)*10.0
    randomapple_y = round(random.randrange(0,window_hieght-blocksize)/10.0)*10.0

    direction = 'rightarrow'
    change_to = direction
    
    Scores = 0
    scores_to_screen(Scores)
    pygame.display.update()
    while not gameexit:
        while gameover == True:
            gamedisplay.fill(black)
            while show_scores == True:
                message_to_screen("YOU SCORED : {} POINTS".format(Scores),red)
                pygame.display.update()
                time.sleep(2)
                show_scores = False
                continue
            message_to_screen("GAME OVER, press c to CONTINUE or q to QUIT",red)
            pygame.display.update()

            #checking the input from the user whtere it is "c" or "q"
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    gameover= False
                    gameexit = True
                
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_q:
                        gameover = False
                        gameexit = True
                    if event.key == pygame.K_c:
                        gameloop()

        while starting_game == True:
            gamedisplay.fill(black)
            mode("Choose level press 1 for easy press 2 for medium press 3 for hard",red)
            pygame.display.update()
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    starting_game = False
                    gameexit = True
                if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_1:
                        FPS = 5
                        starting_game = False
                    elif event.key == pygame.K_2:
                        FPS = 15
                        starting_game = False
                    elif event.key == pygame.K_3:
                        FPS = 25
                        starting_game = False
                    else:
                        gamedisplay.fill(black)
                        mode("Choose the correct options",red)
                        pygame.display.update()
                        time.sleep(2)
                        continue
                    
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                    gameexit = True
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_ESCAPE:
                    myquit()
                
                if event.key == pygame.K_LEFT:
                    change_to = 'leftarrow'
                
                if event.key == pygame.K_RIGHT:
                    change_to = 'rightarrow'
                if event.key == pygame.K_UP:
                    change_to = 'uparrow'
                if event.key == pygame.K_DOWN:
                    change_to ='downarrow'


                #checking whter the snake is moving in right direction or not
                if change_to == 'leftarrow' and direction != 'rightarrow':
                    direction = 'leftarrow'
                if change_to == 'rightarrow' and direction != 'leftarrow':
                    direction = 'rightarrow'
                if change_to == 'uparrow' and direction!= 'downarrow':
                    direction = 'uparrow'
                if change_to == 'downarrow' and direction != 'uparrow':
                    direction = 'downarrow'

                
                #assing the position change to given direction
                if direction == 'leftarrow':
                    change_pixel_of_x = -blocksize
                    change_pixel_of_y = nopixel
                elif direction == 'rightarrow':
                    change_pixel_of_x = blocksize
                    change_pixel_of_y = nopixel
                elif direction == 'uparrow':
                    change_pixel_of_x = nopixel
                    change_pixel_of_y = -blocksize
                elif direction == 'downarrow':
                    change_pixel_of_x = nopixel
                    change_pixel_of_y = blocksize

            if lead_x >= window_width or lead_x <0 or lead_y >= window_hieght  or lead_y<0:
                gameover = True
                show_scores = True
            

        lead_x += change_pixel_of_x
        lead_y += change_pixel_of_y

        gamedisplay.fill(grey)

        applethickness = 20

        print([int(randomapple_x),int(randomapple_y),applethickness,applethickness])

        pygame.draw.rect(gamedisplay,red,[randomapple_x,randomapple_y,applethickness,applethickness])

        #checking if the snake is crossing over itself
        allspriteslist = []
        allspriteslist.append(lead_x)
        allspriteslist.append(lead_y)
        snakelist.append(allspriteslist)
        if len(snakelist) > snakeLength:
            del snakelist[0]

        for eachSegment in snakelist [:-1]:
            if eachSegment == allspriteslist:
                gameover = True
                show_scores = True

        snake(blocksize,snakelist)
        pygame.display.update()

        if lead_x >= randomapple_x and lead_x <= randomapple_x+applethickness:
            if lead_y >= randomapple_y and lead_y <= randomapple_y+applethickness:
                randomapple_x = round(random.randrange(1,window_width-blocksize)/10.0)*10.0
                randomapple_y = round(random.randrange(1,window_hieght-blocksize)/10.0)*10.0
                snakeLength += 1
                Scores += 1
        elif lead_x + blocksize >= randomapple_x and lead_x+ blocksize <= randomapple_x + applethickness:
            if lead_y + blocksize >= randomapple_y and lead_y + blocksize <= randomapple_y + applethickness:
                randomapple_x = round(random.randrange(1,window_width-blocksize)/10.0)*10.0
                randomapple_y = round(random.randrange(1,window_hieght-blocksize)/10.0)*10.0
                snakeLength += 1
                Scores += 1    
                
        scores_to_screen(Scores)
        pygame.display.update()
        clock.tick(FPS)

    pygame.quit()
    quit()


gameloop()