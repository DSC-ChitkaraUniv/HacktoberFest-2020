"""Class for Max Priority Queue"""

class MaxPQ:
    #Constructor
    def __init__(self):
        self.pq = [None]
        self.N = 0

    #Checks if the queue is empty
    def isEmpty(self):
        return self.N == 0

    #Deletes the max element
    #and returns it
    def deleteMax(self):
        Max = self.pq[1]
        self.exch(1, self.N)
        self.N -= 1
        self.sink(1)
        self.pq[self.N + 1] = None
        return Max

    #inserts an element into the queue
    def insert(self, element):
        self.N += 1
        self.pq.append(element)
        self.swim(self.N)

    #Heapify method
    def swim(self, k):
        while k > 1 and self.less(k // 2, k):
            self.exch(k, k // 2)
            k = k // 2

    #Heapify method
    def sink(self, k):
        while 2 * k <= self.N:
            j = 2 * k
            if j < self.N and self.less(j, j + 1):
                j += 1
            if not self.less(k, j):
                break
            self.exch(k, j)
            k = j

    def less(self, i, j):
        return self.compareTo(self.pq[i], self.pq[j]) < 0

    #swaps the two elements
    def exch(self, i, j):
        t = self.pq[i]
        self.pq[i] = self.pq[j]
        self.pq[j] = t

    def compareTo(self, n, m):
        return n - m

# CLIENT CODE
if __name__ == "__main__":
    """After creating an object of the class MaxPQ()
        Use the following methods for working with this
        data structure:
        1.insert(): inserts an element into the queue
        2.isEmpty(): return true if the queue is empty
        3.deleteMax(): return the max element after deleting
        it from the queue"""
