edges = [[1,2],[2,3],[4,2]]
s = set()
d = dict()
for i in range(len(edges)):
    for j in range(2):
        if edges[i][j] not in s:
            d[edges[i][j]] = 1
            s.add(edges[i][j])
        else:
            d[edges[i][j]] += 1
print(d)