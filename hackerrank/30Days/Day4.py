class Person:
    def __init__(self,initialAge):
        if(initialAge<0):
            print "Age is not valid, setting age to 0."
            initialAge = 0;
        self.age = initialAge;
    def amIOld(self):
        res = "young." if self.age<13 else "a teenager." if self.age>=13 and self.age<18 else "old."
        print "You are " + res
    def yearPasses(self):
        self.age+=1;
       
t = int(raw_input())
for i in range(0, t):
    age = int(raw_input())         
    p = Person(age)  
    p.amIOld()
    for j in range(0, 3):
        p.yearPasses()        
    p.amIOld()
    print("")    
