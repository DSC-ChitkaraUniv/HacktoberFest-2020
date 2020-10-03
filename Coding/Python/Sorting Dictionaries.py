#Find the largest and second largest key-value pair in dictionaries

#Create a dictionary
dict1 = {"Google":8, "Microsoft":5, "Twitter":3, "Instagram":1, "Slack": 10}

#change the .. in print(list(sorted(example_dict.values()))[..]) to get the desired largest pair
print(list(sorted(dict1.values()))[-1])  #Largest
print(list(sorted(dict1.values()))[-2])  #Second Largest

#Sorting the whole dictionary
#Using key as lambda function
dict1_sorted = sorted(dict1.items(), key=lambda kv: kv[1])
print(dict1_sorted)

#Published By @yuvrajverma01
