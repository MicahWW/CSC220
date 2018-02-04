def F(n):
	if (n == 0):
		return 0
	return F(n / 10) + n % 10

print F(123)
print F(111)
