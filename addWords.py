import sys
import string

while (True):
	word = raw_input("enter word ")

	i = 0
	sum = 0
	while (i < len(word)):
		sum = sum + (ord(word[i]) - 96)
		i += 1
		
	print sum
	print " "