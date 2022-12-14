#ArrayList
    1. add() -  takes O(1) time; however, worst-case scenario, 
       when a new array has to be created and all the elements 
       copied to it, it's O(n)
    2. get() – is always a constant time O(1) operation
    3. add(index, element) – on average runs in O(n) time
    4. remove() – runs in linear O(n) time. We have to iterate 
       the entire array to find the element qualifying for removal.
    5. indexOf() – also runs in linear time. It iterates through 
       the internal array and checks each element one by one, so 
       the time complexity for this operation always requires O(n) 
       time.
    6. contains() – implementation is based on indexOf(), so it'll 
       also run in O(n) time.