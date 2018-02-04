def F(n):
	if (n == 0):
		return 0
	return n + F(n - 1)

print F(5)
print F(10)
