#최댓값 최솟값 위치 찾기 알고리즘

def find_max(a):
    n=len(a)
    max_v = a[0]
    for i in range(1,n):
        if a[i] > max_v:
            max_v=a[i]
    return max_v

v = [17,92,18,33,58,7,33,42] 
print(find_max(v))

def find_max_idx(a):
    n = len(a)
    max_idx = 0
    for i in range (1,n) :
        if a[i] > a[max_idx]:
            max_idx = i
    return max_idx

v = [17, 92, 18, 33, 58, 7 , 33, 42]
print(find_max_idx(v))        

def find_min(a):
    n=len(a)
    min_v = a[0]
    for i in range(1,n):
        if a[i] < min_v:
            min_v=a[i]
    return min_v

v = [2,1,8,9,7,5,6]
print(find_min(v))      