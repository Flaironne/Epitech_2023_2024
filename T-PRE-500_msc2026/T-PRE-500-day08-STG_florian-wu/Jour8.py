import numpy as np
from tkinter import *
import matplotlib.pyplot as plt
import math
#---matplotlib and numpy---

'''x_min = 1
x_max = 50
x_values = np.linspace(x_min, x_max, 100)'

x = [0,1,2,3]
y = [12,32,42,52]

plt.scatter(x,y,color='red',marker = 'o')
# plt.plot(x,y,'o')
plt.grid()
plt.ylabel('some numbers')

#plt.show()

arrayOfPoint = [(2,5),(6,9),(5,3)]

def chart(array):

    x = []
    y = []
    for i in range(len(array)):
        x.append(array[i][0])
        y.append(array[i][1])
    plt.scatter(x,y,color='red',marker = 'o')
    plt.grid()
    plt.show()
    return 0

#chart(arrayOfPoint)'''

def f(x):
    return x**2+x*3+2

def plt_fct(func ,x_min,x_max):

    x = np.linspace(x_min,x_max)
    # print(x)
    y = func(x)
    print(y)
    plt.plot(x,y)
    plt.xlim(x_min,x_max)
    plt.grid()
    plt.show()

#plt_fct(np.sin,-0,50)
#plt_fct(f,-100,200)
#plt_fct(lambda x: x**2,-10,10)
# plt_fct(lambda x: 1/x,-100,100)

window = Tk()
window.title("MY GRAPHIC PROGRAM")
window.geometry("1080x960")
label_frame = LabelFrame(window, text="This is a labelFrame")
label_frame.pack(fill= BOTH ,expand= True )

left = Label(label_frame, text="Inside the LabelFrame")
left.pack()

e = Entry(label_frame,text="SALUT")
e.pack()

b = Button(label_frame,text="This is a button")
b.pack()

window.mainloop()