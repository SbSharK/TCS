class Container:
    def __init__(self,idi,length,breadth,height,pricepersqrft):
        self.idi = idi
        self.length = length
        self.breadth = breadth
        self.height = height
        self.pricepersqrft = pricepersqrft
    def getVolume(self):
        self.volume = self.length*self.breadth*self.height
        return self.volume

class PackagingCompany:
    def __init__(self,conlist):
        self.conlist = conlist
    def findLargestContainer(self):
        res = 0
        for obj in self.conlist:
            #res = obj.getVolume()
            if  res<obj.getVolume():
                res = obj.getVolume()
                id1 = obj.idi
            else:
                continue
        print(id1,res)
	
    def findContainerCost(self,id1):
        for obj in self.conlist:
            if obj.idi == id1:	
                res1 = obj.getVolume()
                return res1*obj.pricepersqrft
            else:
                continue

if __name__ == "__main__":
    n = int(input())
    li = []
    for i in range(n):
        d = int(input())
        l = int(input())
        b = int(input())
        h = int(input())
        s = int(input())
        li.append(Container(d,l,b,h,s))
    packa = PackagingCompany(li)
    id1 = int(input())
    res = packa.findContainerCost(id1)
    if(res == None):
    	print("No container found")
    else:
        print(res)
    packa.findLargestContainer()
