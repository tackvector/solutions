# First Unique Character

## In Python
To find the first unique character in a given string, we used
the count method to see which characters appeared only once (meaning,
they have a count of 1, where .count() is concerned). We push those
characters to a list. Then, we check the length of the list.

If the length of the list is greater than one, we assume
that the first unique character is the first element in the list.
We return the index of that character using the str.index() method.

If the list is empty, we return -1.

# Code Comments

iterate over every character in string 's'
look for matches of the character in the rest of the string
if there aren't any, return the index of that character
otherwise, return -1

we can use the str.count() method for this

We could add the unique characters to a list
and return the index of that character,
wherever it is in 's' using s.index(list_of_chars[0])

unique characters are defined as characters that have a count of 1

so, if the count of a character is equal to one, push it to a list
then return the index of the first element of that list

the length of the chars list must be greater than zero if there are any unique characters
if it is, the first unique character will be the first character in the list, so return it
if it isn't (if the list is empty), we should return -1
