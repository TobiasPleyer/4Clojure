;; Recognize Playing Cards - http://www.4clojure.com/problem/128
(fn read-card [card]
  (let [suit-map {\H :heart
                  \D :diamond
                  \S :spade
                  \C :club}
        rank-map {\2 0 \3 1 \4 2 \5 3 \6 4 \7 5 \8 6 \9 7 \T 8 \J 9 \Q 10 \K 11 \A 12}
        suit (first card)
        rank (second card)]
    {:suit (suit-map suit) :rank (rank-map rank)}))