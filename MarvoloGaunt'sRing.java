B. Marvolo Gaunt's Ring
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Professor Dumbledore is helping Harry destroy the Horcruxes. He went to Gaunt Shack as he suspected a Horcrux to be present there. He saw Marvolo Gaunt's Ring and identified it as a Horcrux. Although he destroyed it, he is still affected by its curse. Professor Snape is helping Dumbledore remove the curse. For this, he wants to give Dumbledore exactly x drops of the potion he made.

Value of x is calculated as maximum of p·ai + q·aj + r·ak for given p, q, r and array a1, a2, ... an such that 1 ≤ i ≤ j ≤ k ≤ n. Help Snape find the value of x. Do note that the value of x may be negative.

Input
First line of input contains 4 integers n, p, q, r ( - 109 ≤ p, q, r ≤ 109, 1 ≤ n ≤ 105).

Next line of input contains n space separated integers a1, a2, ... an ( - 109 ≤ ai ≤ 109).

Output
Output a single integer the maximum value of p·ai + q·aj + r·ak that can be obtained provided 1 ≤ i ≤ j ≤ k ≤ n.

Examples
inputCopy
5 1 2 3
1 2 3 4 5
outputCopy
30
inputCopy
5 1 2 -3
-1 -2 -3 -4 -5
outputCopy
12
Note
In the first sample case, we can take i = j = k = 5, thus making the answer as 1·5 + 2·5 + 3·5 = 30.

In second sample case, selecting i = j = 1 and k = 5 gives the answer 12.
