import time
count = 0
def Hanoi(n, src, dst, tmp):
	if n > 0:
		global count
		count += 1
		Hanoi(n - 1, src, tmp, dst)
		print "Move disc", n, "From tower", src, "to tower", dst
		Hanoi(n - 1, tmp, dst, src)
discs = raw_input("How many discs? ")
discs = int(discs)

try:
	start = time.time()
	Hanoi(discs, 0, 2, 1)
	end = time. time()

	print count
	print " "
	print end - start
except:
	print "count {}".format(count)
	end = time.time()
	print " "
	print end - start
