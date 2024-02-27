class Employee:
def __init__(self, name, salary, workHours, hireYear):
self.name = name
self.salary = salary
self.workHours = workHours
self.hireYear = hireYear

def tax(self):
        if self.salary > 1000:
        return self.salary * 0.03
        else:
        return 0

def bonus(self):
        if self.workHours > 40:
extra_hours = self.workHours - 40
        return extra_hours * 30
        else:
        return 0

def raiseSalary(self):
current_year = 2021
years_worked = current_year - self.hireYear
        if years_worked < 10:
        return self.salary * 0.05
elif years_worked < 20:
        return self.salary * 0.10
        else:
        return self.salary * 0.15

def toString(self):
        return f"Name: {self.name}, Salary: {self.salary}, Work Hours: {self.workHours}, Hire Year: {self.hireYear}"

        # Örnek kullanım:
employee1 = Employee("John Doe", 1200, 45, 2015)
print("Tax:", employee1.tax())
print("Bonus:", employee1.bonus())
print("Raise:", employee1.raiseSalary())
print(employee1.toString())
