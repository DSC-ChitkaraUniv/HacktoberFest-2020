//dictionary used to display tic-tac-toe board
board = {
    0: ' ', 1: ' ', 2: ' ',
    3: ' ', 4: ' ', 5: ' ',
    6: ' ', 7: ' ', 8: ' '
}
//player with X key is player 1 and player with o key is player 2
p={"X":1,"o":2}
player = 1          # to initialise first player
total_moves = 0     # to count the moves
end_check = 0
checkr=0
checkc=0
checkd=0
def row():   #to check row
    i=0;
    while(i<=6):
        if  board[i]==board[i+1]==board[i+2]=="X" or board[i]==board[i+1]==board[i+2]=="o":
            winner=board[i]
            print("player ",p[winner]," has won the game !! ")
            return 1
        else:
            i=i+3
def column():    #to check column
    i=0;
    while(i!=3):
        if board[i] == board[i+3] == board[i+6]== "X" or board[i] == board[i+3] == board[i+6]== "o" :
            winner=board[i]
            print("player ",p[winner], " won the game !! ")
            return 1
        else:
            i=i+1
def diagonal():    #to check diagonal
    if board[0] == board[4] == board[8]=="X" or board[0] == board[4] == board[8]=="o" :
        winner=board[0]
        print("player ",p[winner]," has won the game !! ")
        return 1
    elif board[2] == board[4] == board[6]=="X" or board[2] == board[4] == board[6]=="o" :
        winner=board[2]
        print("player ",p[winner]," has won the game !! ")
        return 1

print('0 |1 |2')
print('- +- +-')
print('3 |4 |5')
print('- +- +-')
print('6 |7 |8')
print('***************************')

while True:
    print(board[0]+'|'+board[1]+'|'+board[2])
    print('-+-+-')
    print(board[3] + '|' + board[4] + '|' + board[5])
    print('-+-+-')
    print(board[6] + '|' + board[7] + '|' + board[8])   

    //check all possibilities of ending a game.
    checkr=row()
    if total_moves == 9 or checkr==1 :
        break
    checkc=column()
    if total_moves == 9 or checkc==1 :
        break
    checkd=diagonal()
    if total_moves == 9 or checkd==1 :
        break   
    while True:     # input from players
        if player == 1:  # choose player
            p1_input = int(input('player one'))
            if p1_input in board and board[p1_input] == ' ':
                board[p1_input] = 'X'
                player = 2
                break
            # on wrong input
            else:
                print('Invalid input, please try again !')
                continue
        else:
            p2_input = int(input('player two'))
            if p2_input in board and board[p2_input] == ' ':
                board[p2_input] = 'o'
                player = 1
                break
            else:  # on wrong input
                print('Invalid input, please try again')
                continue
    total_moves += 1
    print('***************************')
    print()
    
    
