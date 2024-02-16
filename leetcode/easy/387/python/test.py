from solution import Solution

cases = ['leetcode', 'loveleetcode', 'aabb', 'aabbcc', 'abcde']

solver = Solution()

for case in cases:
    result = solver.first_uniq_char(case)
    print(f"Case: '{case}', returns: {result}")