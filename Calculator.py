from tkinter import *

exp = ""

def press(num):
    global exp
    exp = exp + str(num)
    equation.set(exp)

def equalpress():
    try:
        global exp
        total = str(eval(exp))
        equation.set(total)
        exp = ""
    except:
        equation.set("MATH / Syntax Error")
        exp = ""

def clear():
    global exp
    exp = ""
    equation.set("")

if __name__ == "__main__":
    gui = Tk()
    gui.configure(bg="black")
    gui.title("SAkthi CALCulator")
    gui.geometry("270x180")

    equation = StringVar()
    expf = Entry(gui, textvariable=equation)
    expf.grid(columnspan=4, ipadx=70)

    but1 = Button(gui, text='1', fg='black', bg='green', command=lambda: press(1), height=1, width=7)
    but1.grid(row=2, column=0)
    but2 = Button(gui, text='2', fg='black', bg='green', command=lambda: press(2), height=1, width=7)
    but2.grid(row=2, column=1)
    but3 = Button(gui, text='3', fg='black', bg='green', command=lambda: press(3), height=1, width=7)
    but3.grid(row=2, column=2)
    but4 = Button(gui, text='4', fg='black', bg='green', command=lambda: press(4), height=1, width=7)
    but4.grid(row=3, column=0)
    but5 = Button(gui, text='5', fg='black', bg='green', command=lambda: press(5), height=1, width=7)
    but5.grid(row=3, column=1)
    but6 = Button(gui, text='6', fg='black', bg='green', command=lambda: press(6), height=1, width=7)
    but6.grid(row=3, column=2)
    but7 = Button(gui, text='7', fg='black', bg='green', command=lambda: press(7), height=1, width=7)
    but7.grid(row=4, column=0)
    but8 = Button(gui, text='8', fg='black', bg='green', command=lambda: press(8), height=1, width=7)
    but8.grid(row=4, column=1)
    but9 = Button(gui, text='9', fg='black', bg='green', command=lambda: press(9), height=1, width=7)
    but9.grid(row=4, column=2)
    but0 = Button(gui, text='0', fg='black', bg='green', command=lambda: press(0), height=1, width=7)
    but0.grid(row=5, column=0)

    add = Button(gui, text='+', fg='black', bg='red', command=lambda: press('+'), height=1, width=7)
    add.grid(row=2, column=3)
    sub = Button(gui, text='-', fg='black', bg='red', command=lambda: press('-'), height=1, width=7)
    sub.grid(row=3, column=3)
    mul = Button(gui, text='*', fg='black', bg='red', command=lambda: press('*'), height=1, width=7)
    mul.grid(row=4, column=3)
    div = Button(gui, text='/', fg='black', bg='red', command=lambda: press('/'), height=1, width=7)
    div.grid(row=5, column=3)

    equal = Button(gui, text='=', fg='black', bg='orange', command=equalpress, height=3, width=8)
    equal.grid(row=5, column=2)

    clear_button = Button(gui, text='C', fg='green', bg='white', command=clear, height=3, width=8)
    clear_button.grid(row=5, column=1)

    dec = Button(gui, text='.', fg='black', bg='red', command=lambda: press('.'), height=1, width=7)
    dec.grid(row=6, column=0)

    gui.mainloop()

    
    
    





