n = int(input())
segments = [tuple(map(int, input().split())) for _ in range(n)]

l = [0 for _ in range(101)]

for a, b in segments:
    for i in range(a, b+1):
        l[i] += 1

print(max(l))