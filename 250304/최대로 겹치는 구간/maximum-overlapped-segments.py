n = int(input())

h = [0 for i in range(210)]

for i in range(n):
    x1, x2 = map(int, input().split())

    x1 += 100
    x2 += 100

    for j in range(x1, x2):
        h[j] += 1

max_num = max(h)

print(max_num)