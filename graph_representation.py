V = int(input())
E = int(input())

edges = []
for e in range(0, E):
    source, destination = map(int, input().split())
    edges += [[source, destination]]

print("Number of vertices: ", V)
print("Number of edges: ", E)
print("Edges: ", edges)

print("Computing matrix representation of the graph.")
grid = []
for r in range(V):
    row = []
    for c in range(V):
        row += [0]
    grid += [row]
for e in edges:
    source, destination = e[0], e[1]
    source -= 1
    destination -= 1
    grid[source][destination] = grid[destination][source] = 1
print(grid)

print("Computing linked list representation of the graph.")

d = dict()
for e in edges:
    source, destination = e[0], e[1]
    
    # Source -> [..., destination]
    if source in d:
        d[source].append(destination)
    else:
        d[source] = [destination]
    
    # Skip adding destination to source edge when
    # both are the same to avoid adding duplicate
    # edge.
    if source == destination:
        continue
        
    # Destination -> [..., source]
    if destination in d:
        d[destination].append(source)
    else:
        d[destination] = [source]
print(d)