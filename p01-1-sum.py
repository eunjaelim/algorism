# 순차적 방법
 def sum_n(n):
     s=0;
     for i in range(1,n+1):
         s=s+i
     return s;

 print(sum_n(10))
 print(sum_n(100))    


# 유클리드 방법

def sum_n(n):
    return n*(n+1)//2

print(sum_n(10))
print(sum_n(100))