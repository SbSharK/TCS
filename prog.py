class Container:
	def __init__(self,id1,length,breadth,height,pricepersqrft):
		self.id1 = id1
		self.length = length
		self.breadth = breadth
		self.height = height
		self.pricepersqrft = pricepersqrft
		
	def find_volume(self):
		return self.length*self.breadth*self.height
		
class PackagingCompany():
	def __init__(self,l):
		self.containerList = l
		
	def findContainerCost(self,id1):
		for obj in self.containerList:
			if obj.id1 == id1:
				res1 = obj.find_volume
				return res1*obj.pricepersqrft
			else:
				continue
	
	def findLargestContainer(self):
		max1 = 0
		r = []
		for obj in self.containerList:
			r.append(obj.find_volume)
		max1 = max(r)
		for obj in self.containerList:
			res = obj.find_volume()
			if max1 == res:
				return obj
			else:
				continue
	
inpnum = int(input())
arrObj = []
for i in range(inpnum):
	idinp = input()
	length = int(input())
	breadth = int(input())
	height = int(input())
	persqrft = int(input())
	arrObj.append(Container(idinp,length,breadth,height,persqrft))
id1 = int(input())
t = PackagingCompany(arrObj)
res1 = t.findContainerCost(id1)
res2 = t.findLargestContainer()
print(res1)
print(res2)
