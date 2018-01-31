#def hanoi(n, source, helper, target):
#	if n > 0:
		# move tower of size n - 1 to helper:
#		hanoi(n - 1, source, target, helper)
		# move disk from source peg to target peg
#		if source:
#			target.append(source.pop())
		# move tower of size n - 1 from helper to target
#		hanoi(n - 1, helper, source, target)
#	print count

#source = [3, 2, 1]
#target = []
#helper = []
#hanoi(len(source), source, helper, target)

#print source, helper, target

count = 0
def Hanoi(n, src, dst, tmp):
	if n > 0:
		global count
		count += 1
		Hanoi(n - 1, src, tmp, dst)
#		print "Move disc", chr(64 + n), "From tower", src, "to tower", dst
		Hanoi(n - 1, tmp, dst, src)
discs = raw_input("How many discs? ")
discs = int(discs)

Hanoi(discs, 0, 2, 1)

print count
