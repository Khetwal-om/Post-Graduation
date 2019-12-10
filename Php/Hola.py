

number=6

def fibonacci(number):
	print(number)
	if number<=1:
		return 1
	else: 
		return fibonacci(number-1)+fibonacci(number-2)

print(fibonacci(number))