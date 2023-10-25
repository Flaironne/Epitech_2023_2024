
def main():
    return 1

#---Strings---

MyVar = "Hello World !"

'''print(MyVar)

#print(MyVar[0])
#print(MyVar[4])

#print(MyVar[-1:])

#print(MyVar[4:9])'''

#---Strings Methods---

#print(MyVar.lower())

MyVar2 = "les tutus doivent changer mais pas toto"

#print(MyVar2.replace("tu","ta"))
'''
string = " hello world "
position = string . find ("a")
print ( position )
'''
p = "abcdefghij"
#print (p [:: -2][:5][:: -1][3:])

#print(p[7::2])

def MultiPrint(n):
    if n>=1:
        print(p)
        MultiPrint(n-1)
    else:
        print("FIN")

#MultiPrint(10)

#print(10*(p+"\n"))

'''
s1 = "Hello"
s2 = 42
concat = s1 + str(s2)
print (concat)
'''

'''
string1 = "42"
string2 = "is"
string3 = "the answer"
concat = string1 +" "+ string2 + " " + string3
print ("The string "+ "\"" + concat+ "\"" +" contains 16 characters.")'''

MySentence = "thE Cat’s tactic wAS tO surpRISE thE mIce iN tHE gArdeN" 

def Counter(obj):
    
    count = 0
    string = obj.lower()
    count += string.count('cat')
    count += string.count('tac')
    count += string.count('garden')
    count += string.count('nedrag')
    count += string.count('mice')
    count += string.count('ecim')
    return count

#print(Counter(MySentence))

#---User Inputs---

'''
MyInput = str(input("What is your name "))

print("Hello " + MyInput)
print("Hello " + MyInput.capitalize())
'''
'''
Myinput1 = int(input("Give me a number\n"))
Myinput2 = int(input("Give me a second number\n5"))

sum = Myinput1 + Myinput2

print("The sum of the two provided numbers is\n" + str(sum))
'''

'''
MyInput = int(input("GIVE ME A WHOLE NUMBER\n"))

print(type(MyInput))
'''

MySentence = "This is a test. Is it possible to fly? Good things come to those who never give up."

def FirstWord(objet):

    MyNewSentence = objet.replace("?",".")
    MyNewSentence = MyNewSentence.replace("!",".")
    MyNewSentence = MyNewSentence.replace("...",".")

    MyNewSentence = MyNewSentence.split(". ")
    MyList = ""
    
    for i in range(len(MyNewSentence)):
        new = MyNewSentence[i].split()
        MyList += new[0] + " "
    
    return MyList

print(FirstWord(MySentence))