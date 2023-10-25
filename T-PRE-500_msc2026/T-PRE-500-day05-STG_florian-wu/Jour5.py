import random
import time
#---Lists creation and browsing---


MyList1 = [1,2,3,4,5,8,2,69,8,1]
'''
print(MyList1[0])

print(MyList1[-1])

MyList1.append(6)

for i in range(len(MyList1)):
    print(MyList1[i],end="")

MyList1.pop()
print(*MyList1)


MyList1.insert(0,0)
print(*MyList1)

print(MyList1[2:6])

MyList1.reverse()
print(MyList1)

print(*MyList1[::2])

for x in range(17):
    MyList1.append(x*x+7)

my_first_list = [4 , 5 , 6]
my_second_list = [1 , 2 , 3]
my_first_list.extend(my_second_list)

my_first_list = [7 , 8 , 9]
my_second_list = [4 , 5 , 6]
my_first_list = [* my_first_list , * my_second_list ]

print(my_first_list)
'''

#---Operations on lists---

'''L = [1,2,3,4,5,6,7,8,9]
res = 1
for num in L:
    res *= num
print(res)

print([x + 10 for x in [3, 2, 6, 7, 1, 4]])

print(list(map(lambda x: x * x, [3, 2, 6, 7, 1, 4])))

max = MyList1[0]
min = MyList1[0]
for num in MyList1:
    if num>max:
        max = num
    if num<min:
        min = num

print("max :",max,"\nmin :",min)

comparateur = 7
for num in MyList1:
    if num<7:
        print(num,end="")

MyList1.sort(reverse = True)
print("")
print(MyList1)

print([x // 2 if x % 2 == 0 else x * 2 for x in [42, 3, 4, 18, 3, 10]])

print(list(filter(lambda x: x > 10, [42, 3, 4, 18, 3, 10])))

print([*enumerate([42, 3, 4, 18, 3, 10])])

first_name = [" Jackie ", " Bruce ", " Arnold ", " Sylvester "]
last_name = [" Stallone ", " Schwarzenegger ", " Willis ", " Chan "]
magic = [* zip ( first_name , last_name [:: -1]) ]
print ( magic [0])
print ( magic [3])
print ( magic [1][0])
print ( magic [0][1])
print ( magic [2])'''

'''startingTime =  time.time()


MillionList = []

for i in range(1000000):
    MillionList.append(random.randint(1,100))
MillionList = [random.randint(1,100) for _ in range(1000000)]

MillionList.sort()  
#print(*MillionList , "\t") 
duration = time.time() - startingTime
print(duration)'''


#---Dictionaries---

student = {
    "Franky" : 2020
}

dico1 = {
    "name" : "Web dev",
    "credits" : 3,
    "grade" : "C"
}

dico2 = {
    "name" : "Network and SystAdmin",
    "credits" : 6,
    "grade" : "A"
}

dico3 = {
    "name" : "Java",
    "credits" : 1,
    "grade" : "D"
}

MyArray = [dico1,dico2,dico3]

def Verif(AnArray):
    V = True
    for i in range(len(AnArray)):
        if not isinstance(AnArray[i]["name"],str):
            V = False
        if AnArray[i]["credits"]<1:
            V = False
            print(2)
        if ord(AnArray[i]["grade"])<64:
            V = False
            print(3)
        if ord(AnArray[i]["grade"])>70:
            V = False
            print(4)
    return V

if Verif(MyArray):
    student["units"] = MyArray

grade_weight_mapping = {
    "A" : 4,
    "B" : 3,
    "C" : 2,
    "D" : 1,
    "E" : 0,
}

#print(student)

Tamp = student["units"]
total = 0
letters = ""
totalScore = 0
for i in range(len(Tamp)):
    total += Tamp[i]["credits"]
    letters += Tamp[i]["grade"]

letters = [*letters]
for lt in letters:
    totalScore += grade_weight_mapping[lt]

student["total_credits"] = total
student["GPA"] = totalScore/len(letters)

#print(student)

#print(student)
#StudentList = [student1,student2,student3]

#---Let's go further---

'''Guest = ["Alice", "Bob", "Charlie", "David", "Eva", "Fiona", "George", "Hannah", "Ivan", "Julia"]

Name = str(input("Give me a name\n"))
if Name in Guest:
    print("welcome in")
else:
    print("get lost!")

def DupRm(Mylist):
    count = 0
    for e in Mylist:
        count = 0
        for e2 in Mylist:
            if e == e2:
                count +=1
                if count != 1:
                    Mylist.remove(e)
    return Mylist

L = [1,2,3,4,1,2,5,8,1,1,1,11,1,6]

#OR USING SET RETURN 
#print(list(set(L)))

#print(DupRm(L))

M1 = ["Monday","10:00 AM","Alice", "Bob", "Charlie"]
M2 = ["Tuesday","2:30 PM","David", "Eva"]
M3 = ["Wednesday","1:00 PM","Fiona", "George", "Hannah","Eva"]
MeetingList = [M1,M2,M3]

nameAsked =  str(input("Give me the name of the person to know his schedule\n"))

HaveAMeeting = False
for i in range(len(MeetingList)):
    
    for e in MeetingList[i]:
        if nameAsked == e:
            print(MeetingList[i])
            HaveAMeeting = True
    
if not HaveAMeeting:
    print("You don't have meeting :( ")'''