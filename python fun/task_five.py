sum = 0 
for counter in range (1, 11):
    score = int(input("Enter 10 score: "))
    if counter>=0 and counter<=100 and counter%2==0:
        sum +=score
print("sum=", sum)
