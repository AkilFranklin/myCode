module Destructable # module names should end in "able"
  def destroy(anyobject)
    puts "I will destroy the object"
  end
end

class User
  include Destructable
  attr_accessor :name, :email    # allows for objects to be set or grabbed or whatever down below
  def initialize(name, email)
    @name = name            # @ signifies that its an instance varaible
    @email = email
  end
  
  def run
    puts "Hey #{name} I'm running"
  end
  
  def self.identify_yourself
    puts "I am a class method"
  end
  
end

class Buyer < User #left arrow is for creating a subclass

end

class Seller < User 
  
end

class Admin < User
  
end

user = User.new("Akil", "blah@blah.com")     # .new will initialize an object
#puts User.ancestors  #------ ancestors will list out all of the super classes of "User"
#puts user.name
user.name = "Bob"
#puts user.name
#puts user.email
#puts "My user name is #{user.name} and his email is #{user.email}"

#buyer1 = Buyer.new("Buyer1", "johnd@example.com")
#buyer1.run

#seller1 = Seller.new("Seller 1", "johnd1@example.com")
#seller1.run

#admin1 = Admin.new("Admin1", "johnd2@example.com")
#admin1.run

#puts Buyer.ancestors

#User.identify_yourself # calling a class method without initiaing an object for it

user = User.new("Akil","akil@ffefe.com")
user.destroy("myname")