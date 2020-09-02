# Here instead of using the the modulo(%) operator we can use & to reduce the time for operation on very big numbers
# All we needed to do was to look at the last bit of n to determine even or odd
# Which then helps us to add or subtract to get minimum transformations  

def solution(pallets):
    pallets=int(pallets)
    Transformcnt = 0
    
    while(pallets > 1):
        if(pallets & 1 == 0):
            pallets = pallets / 2
        elif(((pallets + 1) & pallets) > ((pallets - 1)&(pallets - 2)) or (pallets == 3)):
            pallets -= 1
        else:
            pallets += 1
        Transformcnt += 1
    
    return Transformcnt
    
print(solution("15"))    
