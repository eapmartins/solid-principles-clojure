(ns schema.customer)

(defn parse-customer
  [lines]
  (let [[_ id] (re-matches #"^Customer-id: (\d{7})$" (nth lines 0))
        [_ name] (re-matches #"^Name: (.+)$" (nth lines 1))
        [_ address] (re-matches #"^Address: (.+)$" (nth lines 2))
        [_ customer-limit] (re-matches #"^Credit limit: (\d+)$" (nth lines 3))]
    {:id           id
     :name         name
     :address      address
     :credit-limit customer-limit}))
