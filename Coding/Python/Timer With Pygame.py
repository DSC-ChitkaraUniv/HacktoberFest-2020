import pygame
 
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
 
pygame.init()
 
size = [500, 300]
screen = pygame.display.set_mode(size)
 
pygame.display.set_caption("The Timer | @yuvrajverma01")
 
done = False
 
clock = pygame.time.Clock()
 
font = pygame.font.Font(None, 25)
 
frame_count = 0
frame_rate = 60
start_time = 20 #Timer Count in seconds
 
while not done:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
 
    screen.fill(WHITE)

    t_s = frame_count // frame_rate
 
    m = t_s // 60
    s = t_s % 60
 
    output_string = "Time: {0:02}:{1:02}".format(m, s)
 
    text = font.render(output_string, True, BLACK)
    screen.blit(text, [180, 140])
 
    t_s = start_time - (frame_count // frame_rate)
    if t_s < 0:
        t_s = 0
 

    m = t_s // 60
    s = t_s % 60
 
    output_string = "Time left: {0:02}:{1:02}".format(m, s)
 
    text = font.render(output_string, True, BLACK)
    screen.blit(text, [165, 120])

    frame_count += 1
    # Limit frames per second
    clock.tick(frame_rate)
    pygame.display.flip()
pygame.quit()

#Published By @yuvrajverma01