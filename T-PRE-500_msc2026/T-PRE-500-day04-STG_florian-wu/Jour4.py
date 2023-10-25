
#---Conditionals---

def Ctask1():
    UserInteger = int(input("Give me an integer ^^ \n"))

    if UserInteger == 42:
        print("Correct Answer")

#Ctask1

def Ctask2():
    UserInteger = int(input("Give me an integer ^^ \n"))

    if UserInteger%2 == 0:
        print("This integer is even")
    else:
        print("This integer is odd")

#Ctask2()

def Ctask3():
    UserString = str(input("Give me password to enter the Ali Baba Cavern \n"))

    if UserString == "open sesame":
        print("access granted")
    elif UserString == "will you open, you goddamn !¤*@¡":
        print("access fucking granted")
    else:
        print("permission denied")

#Ctask3()

def Ctask4():
    
    UserInteger = int(input("Give me an integer ^^ \n"))

    match UserInteger:
        case 42:
            print("OK")
        case _ if UserInteger<=21:
            print("OK")
        case _ if UserInteger%2==0:
            print("OK")
        case _ if UserInteger//2<21:
            print("OK")
        case _ if UserInteger%2!=0 and UserInteger>=45:
            print("OK")
        case _:
            print("You got wrong my poor friend")

#Ctask4()
'''
a = 42
b = 41
if a == b:
    print("A and B are the sames ")
if b <= a:
    print("B is equal or lower than A")
if b != a:
    print("B is different from A")
'''

#---Loops---
'''
n = 1
while(n<=1000):
    print( str(n), end="\t ")
    n +=1
'''

def Ltask1():
    UserString = str(input("Give me a string\n"))

    for i in range(len(UserString)):
        print(2*UserString[i],end="")

#Ltask1()

def Ltask2():

    for i in range(10000,1,-1):
        if i%7 == 0:
            print(i,end="\t ")

#Ltask2()

def Ltask3():

    for i in range(-30,31):
        if i%15==0:
            print("FizzBuzz")
        elif i%3==0:
            print("Fizz")
        elif i%5==0:
            print("Buzz")
        else:
            print(i)

#Ltask3()

def Ltask4():

    for i in range (99,0,-1):
        if i!=1:
            print(str(i)+" bottles of age-appropriate beverage on the wall")
            print("Take one down, pass it around\n")
        else:
            print(str(i)+" bottle of age-appropriate beverage on the wall")
            print("Take one down, pass it around\n")
    print("No more bottles of age-appropriate beverage on the wall")
    print("Go to the store and buy some more")

#Ltask4()

def Ltask5(n):
    for i in range (2,(n//2)+1):
        print("")
        for j in range(n-1,0,-1):
            if i*j < n:
                print(str(j*i), end=" ")

#Ltask5(27)

def Challenge():
    UserString = str(input("Give me a String\n"))
    n = int(input("Give me a int\n"))
    if n == 0:
        return 0
    print("")
    newString = UserString.lower()
    myBoolean = False

    for i in range(len(UserString)):
        if UserString[i] in ('a','e','i','o','u'):
            myBoolean = True
    if myBoolean:
        print(n)
    if n >= 42:
        print(n)
    else:
        print(UserString)

#Challenge()

#---Encryption---

def Etask1():
    msg = str(input("Give me a message to be encrypted\n"))
    key = int(input("Give me a key\n"))

    newMsg =  msg.lower()
    encrypMsg = ""

    for i in range(len(msg)):
        if ord(newMsg[i])>96 and ord(newMsg[i])<123:

            value = ord(newMsg[i])+key
            if  value >= 123:
                value -= 25
                newLettter = chr(value)
                encrypMsg += newLettter
            elif value <=96:
                value +=25
                newLettter = chr(value)
                encrypMsg += newLettter
            else:
                newLettter = chr(value)
                encrypMsg += newLettter
        
        else:
            encrypMsg += newMsg[i]

    print(encrypMsg)

Etask1()

def Etask2():
    msg = str(input("Give me a message to be encrypted\n")).upper()
    key = str(input("Give me a key\n")).upper()
    
    alphabet = [*"ABCDEFGHIJKLMNOPQRSTUVWXYZ"]

    for i in range(len(key)):
        if key[i] not in alphabet:
            key = key.replace(key[i],".")
    key = key.replace(".","")

    encrypMsg = ""
    cleRepet = ""
    compteur = 0

    # On fait une clé répeter
    for i in range(len(msg)):
        if msg[i] in alphabet and i<len(key):
            cleRepet += key[i-compteur]
        elif msg[i] in alphabet:
            i %= len(key)
            cleRepet += key[i-compteur]
        else:
            cleRepet += " "
            compteur +=1
    
    # On définit le message crypté
    for i in range(len(cleRepet)):

        if cleRepet[i] in alphabet:
            for j in range(len(alphabet)):
                if cleRepet[i] == alphabet[j]:
                    indice = j 
                    value = ord(msg[i])+j
                    if value >90:
                        value -=26
                        encrypMsg += chr(value)
                    else:   
                        encrypMsg += chr(value)
        else:
            encrypMsg += msg[i]
                    
    #print("cle repet est "+cleRepet)
    print("------------------------")
    print("Le Texte chiffré est :")
    print(encrypMsg)
    
#Etask2()