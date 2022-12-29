#s = set()
#s.add(1)
#s.add(2)
#print(s)
#print(len(s))
#print({1,2}=={2,1}) # 순서는 무관

# 동명이인 찾기 알고리즘

# 두 번 이상 나온 이름 찾기
# 입력 : 이름이 n개 들어있는 리스트
# 출력: n개 중 반복되는 이름의 집합

def find_same_name(a) :
    n = len(a) # 리스트의 자료의 개수를 n 에 저장
    result = set() # 결과를 저장할 빈 집합
    for i in range(0,n-1):
        for j in range(i+1,n):
            if a[i] == a[j]:
                result.add(a[i])
    return result

name = ["Tom","Jerry","Mike","Tom"]
print(find_same_name(name))
name2 = ["Tom","Jerry","Mike","Tom","Mike"]
print(find_same_name(name2))





