
#리스트

a = [17,92,18,33,58,7,33,42]
print(len(a)) #리스트의 길이
a.append(99) # 리스트의 맨 뒤에 추가
a.insert(0,2) # 리스트 0번위치 2를 추가
print(a.pop()) # 마지막 값 빼기
print(a.pop(0)) # 0번쨰 값 빼기
a.clear() # 리스트의 모든 원소값 지우기
print(a)
b = [17,92,18,33,58,7,33,42]
print(92 in b) # 92가 b 안에 있으므로 true
