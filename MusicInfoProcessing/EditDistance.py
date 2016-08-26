#Program to calculate the edit distance between two .dat files.


import glob,os,numpy
path = 'Data//'
data1 = []
inputfile = "Input file//chpn-p1.dat"
f = open(inputfile, "r")
for x in f:
    data1.append(x)


a = []

#Edit distance fucntion
def editdistance(f, s):
    if len(f) > len(s):
        f, s = s, f
    if len(s) == 0:
        return len(f)
    flen = len(f) + 1
    slen = len(s) + 1
    #dm = numpy.zeros((slen,flen),	dtype=int)  #matrix initialization
    dm = [[0] * slen for x in range(flen)]
    for i in range(flen):  #fill the first row and column
        dm[i][0] = i
    for j in range(slen):
        dm[0][j] = j
    for i in range(1, flen): #fill the rest of the matrix
        for j in range(1, slen):
            delete = dm[i-1][j] + 1
            insert = dm[i][j-1] + 1
            sub = dm[i-1][j-1]
            if f[i-1] != s[j-1]:
                sub += 1
            dm[i][j] = min(insert, delete, sub)
    return dm[flen-1][slen-1]

#Loop through all the .dat files in the directory
#for filename in glob.glob('*.dat'):
for filename in glob.glob(os.path.join(path, '*.dat')):
    data = []
    f = open(filename, "r")
    for x in f:
        data.append(x)
    s = editdistance(data1,data) #calculate the edit distance
    a.append((filename,len(data),s))   #append the result to a list in the format - File name, length of file, edit distance.



#edit distance output
k = 0
for i in a:
    print("Edit distance between %s and %s is %s  " % (inputfile,a[k][0], a[k][2]))
    k+=1


#Least edit distance finder
p = 0
min = 1000000
fname = ''  #file name
for i in a:
    if(a[p][2]< min):
        min = a[p][2]
        #fname = a[p][0]
    p+=1

print("\n")

u = 0
for i in a:
    if(a[u][2]== min):
        min1 = a[u][2]  #don't really need this but just to be sure
        fname = a[u][0]
        print("The least edit distance is %s of file %s" %(min1,fname))
    u+=1



#print("The least edit distance is %s of file %s" %(min,fname))





'''
#Simmilarity finder
#If 2 objects are similar they have similarity score 1.0. Now if two object are not completely similar but are somewhat similar we calculate
#it via the following formula. Here we take the ratio of the edit distance and the maximum length of the two objects and then subtract it from 1.0


k = 0
print("Similarity score between %s and all other .dat files" %(inputfile))
for i in a:
    similarity = 1.0 - (float(a[k][2])/float(max(len(data1),a[k][1])))
    print("Total similarity score for %s is %s  " % (a[k][0], similarity))
    k+=1
'''