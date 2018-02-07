require 'json'

class User
  attr_accessor :email, :name, :permissions
  
  def initialize(*args) #splap operator. takes in arguments as they are passed in and creates an array. 
    @email = args[0]
    @name = args[1]
    @permissions = User.permissions_from_template
  end
  
  def self.permissions_from_template
    file = File.read 'user_permissions_template.json'
    JSON.load(file, nil, symbolize_names: true)
  end
  
  def save
    self_json = {email: @email, name: @name, permissions: @permissions}.to_json #this is a JSON object
    open('users.json', 'a') do |file|
      file.puts self_json
    end
  end
end