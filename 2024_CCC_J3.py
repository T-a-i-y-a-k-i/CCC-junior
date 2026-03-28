participants = int(input())
scores = []

gold = -1
silver = -1
bronze = -1
total = 0

for i in range(participants):
    s = int(input())
    scores.append(s)
    
    if s > gold:
        bronze = silver
        silver = gold
        gold = s
    elif s < gold and s > silver:
        bronze = silver
        silver = s
    elif s < silver and s > bronze:
        bronze = s

for s in scores:
    if s == bronze:
        total += 1

print(bronze, total)