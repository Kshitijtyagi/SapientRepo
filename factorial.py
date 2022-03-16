def factorial(number):
    temp=number
    factorial=1
    while(temp>=0):
        factorial=factorial*temp
        temp=temp-1
    print(f'Factorial for {number}'," is ", factorial)  # Press Ctrl+F8 to toggle the breakpoint.

num=int(input("Enter number to caculate Factorial : "))
factorial(num)