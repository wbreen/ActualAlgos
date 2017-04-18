PA1 README

This code takes a text file as input, reads the file line by line into arrays, then checks if there are any duplicate numbers in the line, if there are, it will return false, if there
	are no duplicates, then it will return true.  There seem to be many false returns, I believe this is correct, but I was expecting more true returns.


#6
A. What is the time complexity of the algorithm?

The time complexity is Theta (n^3) because there are two nested loops, leading to n * n * n = n^3

B. If the range of the values were provided, can you think of a more efficient way to solve the element uniqueness problem?

If there was a range of values, you could compare the numbers given to the range of values, then when you match, you take that number out of the range of values, then, if you can't
	find the number in the range of values, you know that there is a duplicate, because the number has been removed from the range