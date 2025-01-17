k = 10
p = 1

print("\n")
print("\n")

for i in range(10):
  
  for j in range(k):
    print(" ", end='')

  for z in range(p):
    print("*", end='')
  
  k -= 1
  p += 2

  print()

for l in range(3):
  for h in range(8):
    print(" ", end='')

  for f in range(4):
    print("*", end='')

  print()
