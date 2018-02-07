#Arrays

a = [0,1,2,3,4,5,6,7,8,9, "Akil",[0,1,2]]

puts a.empty?
puts a.include?("Akil")
puts a.include?("Bob")

#print a.reverse 
#print "\n"
#print a
#print "\n"

#print a.reverse!
#print "\n"
#print a
#print "\n"

y = (0..99).to_a.shuffle
print y
print "\n"

#y.each{ |i| puts i }
#for number in y 
#  puts "Hi"
#end




z = (0..10).to_a
#print z
#print "\n"

z << 25
#print z
#print "\n"

z.push (30)
#print z
#print "\n"

z.unshift("AJ")
#print z
#print "\n"


z << 3
z << 6
#print z
#print "\n"
#print z.uniq
#print "\n"

#print z.uniq!
#print "\n"
#print z
#print "\n"


names = ["joe","john", "john"]
names.each do |food|
  puts "Hello #{food}"
end

names.each do |food|
  puts "Hello #{food.capitalize}"
end

names.each { |food| puts "Hello #{food.capitalize}"}

y.select { |number| number.odd? }
y.each { |number| puts number.to_s + " " if number.odd?}

p = [ "my","name","is","Akil"]

puts p.join
puts p.join(' ')