x = list(map(str, input().split()))
cnt = 0
l = 0
for i in range(cnt, len(x)):
    for j in range(l, len(x)):
        if i != j:
            print(x[i] + x[j])
    l += 1