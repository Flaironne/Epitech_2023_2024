

def main():
    return 1

#---VARIABLES---

def power7(x):
    tamp = x
    for i in range(2,8):
        power = x**i
        print( "the number "+str(tamp)+" power "+str(i)+" is "+str(power))
#power(2)

def MyNumberOfOne(numb):
    var = 0
    for i in range(1,numb+1):
        dernier = i*"1"
        var += int(dernier)
    print(var)
#MyNumberOfOne(9)

def power(x,y):
    return x**y
#print(power(17,1024))

#---MODULO---

def mod(x,y):
    resultat = x/y
    quotient = x//y
    reste = x%y
    print (str(resultat) + "\n" + str(quotient) +"\n"+str(reste))
#mod(42,4)

def OddorEven(x):
    return (x%2 == 0)
#print(OddorEven(3))
#print(OddorEven(4))

def Sum(x):
    decomposition = str(x)
    resultat = 0
    for e in decomposition:
        resultat += int(e)

    return resultat
#print(Sum(123434565))

def integer(x):
    return int(x)

#print(integer(12.24))

def decimal(x):
    return (x-integer(x))

#print(decimal(12.24))

def Pidecimal(x):
    
    if x ==0:
        return 0
    
    formule = 0
    for i in range(1,x+1):
        formule += ((-1)**(i+1))/(2*i+1)

    Pi = 4* formule     
    return (Pi)
    #return formule

#print(Pidecimal(10000000))
#print(Pidecimal(1))

def Pidecimal2(x):

    if x==0:
        return 0

    denominateur = (2*x+1) **2

    for i in range(x,0,-1):
        
        numerateur = ((2*(i-1)+1)**2)
        numerateur /= 6+ denominateur
        denominateur = numerateur
    
    fraction = denominateur
    Pi = 3 + fraction
    return Pi


#print(Pidecimal2(10000000))

def hcf(a, b):
    if(b == 0):
        return a
    else:
        return hcf(b, a % b)
    

def Reduction(n,m):

    pgcd = hcf(n,m)

    if pgcd != n:
        numerateur = int(n/pgcd)
        denominateur = int(m/pgcd)
    else:
        numerateur = n
        denomintaeur = m
    concat = "The reduction of the fraction " + str(n) +"/" +str(m) +" is " + str(numerateur) +"/" + str(denominateur) 
    return concat

print(Reduction(6,4))
