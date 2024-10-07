def solve():
    input = sys.stdin.read
    data = input().splitlines()
    
    index = 0
    T = int(data[index])  # number of test cases
    index += 1
    results = []
    
    for t in range(1, T + 1):
        N = int(data[index])  # number of stations
        index += 1
        
        max_lower_bound = 0
        min_upper_bound = float('inf')
        
        for i in range(1, N + 1):
            A, B = map(int, data[index].split())
            index += 1
            
            max_lower_bound = max(max_lower_bound, A / i)
            min_upper_bound = min(min_upper_bound, B / i)
        
        if max_lower_bound <= min_upper_bound:
            results.append(f"Case #{t}: {max_lower_bound:.6f}")
        else:
            results.append(f"Case #{t}: -1")
    
    # Write the results to answer.txt
    with open("answer.txt", "w") as f:
        f.write("\n".join(results) + "\n")


# Open and read from the input file
with open("subsonic_subway_validation_input.txt", "r") as f:
    sys.stdin = f
    solve()  # Call the solve function while input redirection is still active
