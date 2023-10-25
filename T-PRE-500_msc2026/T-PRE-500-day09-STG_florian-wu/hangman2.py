import random
import sys

def Listeur():

    myTxTfile = sys.argv


    f=open(myTxTfile[1],'r')

    content = f.read()

    mot_pendu = []
    mot = ""

    for e in content:
        if e != "\n":
            mot += e
        else:
            mot_pendu.append(mot)
            mot=""
    return mot_pendu

def display(affichage,fautes=0):
    
    for e in affichage:
        print(e,end=" ")
    print("/ ",fautes," fautes")



def main():

    mot_pendu = Listeur()
    

    print("\nBIENVENUE A TOI JEUNE AVENTURIER :)")
    print("--------------------------------")
    print("LE BUT DU JEU SERA DE TROUVER LE MOT AVEC LE MOINS DE FAUTES POSSIBLE BONNE CHANCE \n\n\n")


    word = random.choice(mot_pendu)

    word = word.upper()
    image = ""
    fautes = 0
    for i in range(len(word)):
            print("_",end=" ")
    print("/ ",fautes," fautes")
    
    userChoice =  str(input("Donne moi une lettre ou un mot! "))
    userChoice = userChoice.upper()

    if userChoice == word:
        image = userChoice
        display(image,fautes)
        print("\n\n"+word," est le mot recherché")
        print("Félicitations! tu l'as trouvé avec",fautes,"faute")

    else:
        image = len(word)*"_"
        while userChoice != word:
            if len(userChoice)>1:
                fautes +=1
                display(image,fautes)
            else:
                count = 0
                tamp = image
                image = ""
                for i in range(len(word)):
                    if userChoice == word[i]:
                        image += word[i]
                        count += 1
                    elif tamp[i] == word[i]:
                        image += word[i]
                    else:
                        image += "_"

                print("Le mot contient",count,"'"+userChoice+"'")

                if count == 0:
                    fautes +=1
                    display(image,fautes)
                else:
                    display(image,fautes)

            userChoice =  str(input("Donne moi une lettre ou un mot! "))
            userChoice = userChoice.upper()

        print("\n\n"+word,"est le mot recherché")
        print("Félicitations! tu l'as trouvé avec",fautes,"fautes")

main()