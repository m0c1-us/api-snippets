require 'twilio-ruby'

response = Twilio::TwiML::VoiceResponse.new
response.say(message: 'Our store is located at 123 Easy St.')
response.sms('Store Location: 123 Easy St.')

puts response
