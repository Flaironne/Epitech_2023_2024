import time
#---Basic Functions---

def bread () :
    print (" <////////// > ")
def lettuce () :
    print (" ~~~~~~~~~~~~ ")
def tomato () :
    print ("O O O O O O")
def ham () :
    print (" ============ ")

def SandwichesNumb(n,veg=False):
    
    if n>0 and not veg:
        for i in range(n):
            print("This is sandwiche number :",i+1)
            bread()
            lettuce()
            tomato()
            ham() 
            ham()
            bread()
    elif n>0 and veg:
        for i in range(n):
            print("This is sandwiche number :",i+1)
            bread()
            lettuce()
            tomato()
            lettuce()
            tomato()
            bread()
    else:
        
        print("I can't do this")

#SandwichesNumb(20,True)
#SandwichesNumb(1)
#SandwichesNumb(42,False)

'''
startingTime = time.time()

#print(42**168)
valeur = 1
for i in range(84):
    valeur *= 42

print(valeur)
duration = time.time() - startingTime
print(duration)'''

#---Recursion---

def palindrome(sentence):
    Mybool = True
    sentence = sentence.upper()
    for i in range(len(sentence)):
        if ord(sentence[i])<65 or ord(sentence[i])>90:
            sentence = sentence.replace(sentence[i],".")
    sentence = sentence.replace(".","")

    for i in range(len(sentence)):
        if sentence[i] != sentence[-(i+1)]:
            return False
    return Mybool

#print(palindrome("never odd or even"))

def palindromeRecur(sentence):
    if len(sentence) == 0:
        return True
    
    sentence = sentence.upper()
    for i in range(len(sentence)):
        if ord(sentence[i])<65 or ord(sentence[i])>90:
            sentence = sentence.replace(sentence[i],".")
    sentence = sentence.replace(".","")

    if sentence[0]==sentence[-1]:
        return palindrome(sentence[1:-1])
    else:
        return False

#print(palindromeRecur("never odd or even"))

"raccourci commentaire ctrl + :"

import os

'''fileDir = "/Users/wuflo/OneDrive/Documents/Epitech_2023_2024"
dirs = os.listdir(fileDir)

for file in dirs:
    print(file)'''

'''import os
for root, dirs, files in os.walk(".", topdown=False):
   for name in files:
      print(os.path.join(root, name))
   for name in dirs:
      print(os.path.join(root, name))'''

def LsR(dir):
    for file in dir:
        if os.path.isfile(file):
           print(file)
        else:
            LsR(file)

print(os.walk(".",))
LsR("/")
#---Higher-order functions---

def funA(s,n):
    Bool = True
    count = 0
    for i in range(len(s)):
        if ord(s[i])>96 and ord(s[i])<=122:
            count += 1

    if count == n:
        return True
    else:
        return False
    
def funB(s,n):
    Bool = True
    count = 0
    for i in range(len(s)):
        if ord(s[i])>=65 and ord(s[i])<=90:
            count += 1

    if count == n:
        return True
    else:
        return False
    
def funC(s,n):
    Bool = True
    count = 0
    for i in range(len(s)):
        count += 1

    if count == n:
        return True
    else:
        return False
    
def funD(s,n):
    Bool = True
    count = 0
    tab ="0123456789"
    for i in range(len(s)):
        if not(s[i] in tab or (ord(s[i])>=65 and ord(s[i])<=90) or (ord(s[i])>96 and ord(s[i])<=122)):
            count += 1
          
    if count == n:
        return True
    else:
        return False
    
def funE(s,n):
    Bool = True
    count = 0
    tab = "0123456789"
    for i in range(len(s)):
        if s[i] in tab:
            count += 1
    if count == n:
        return True
    else:
        return False

def check_password(option,n,password):

    match option:
        case "lower":
            return(funA(password,n))
        case "upper":
            return(funB(password,n))
        case "characters":
            return(funC(password,n))
        case "special":
            return(funD(password,n))
        case "number":
            return(funE(password,n))
        case _:
            print("not a right option")
        
#print(check_password("number",3,"myp!!AS123WWORD"))