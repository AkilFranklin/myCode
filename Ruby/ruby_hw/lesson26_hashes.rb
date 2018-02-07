# Hashes

my_details = { 'name' => 'Akil', 'favcolor' => 'red'}


myhash = {a:1, b:2, c:3}
myhash[:c]

myhash[:name] = "Akil"
myhash.delete(:b)
myhash.each {|k,v| puts v}
myhash.select {|k,v| v.odd?}
 myhash.select {|k,v| v.even?}