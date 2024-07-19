(ns logic.notifiable)

(defprotocol Notifiable
  (send [this]))

(defn send-email
  [recipient message]
  (println "sending email to" recipient "with message" message)
  {:status :sent})

(defn send-sms
  [recipient message]
  (println "sending sms to" recipient "with message" message))

(defrecord EmailNotification
  [recipient message]
  Notifiable
  (send [_] (send-email recipient message)))

(defrecord SMSNotification
  [recipient message]
  Notifiable
  (send [_] (send-sms recipient message)))

(defn send-notification
  [notification]
  (send notification))
