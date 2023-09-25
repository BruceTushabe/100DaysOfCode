import pandas as pd 



emails = pd.read_csv('spam.csv')


from sklearn.feature_extraction.text import CountVectorizer
vect = CountVectorizer()
X = vect.fit_transform(emails['text'])

y = emails['spam']

# Train a model

from sklearn.naive_bayes import MultinomialNB

nb = MultinomialNB()
nb.fit(X,y)


# Make predictions

emails_new = pd.read_csv('spam.csv')

X_new = vect.transform(emails_new['text'])

predictions = nb.predict(X_new)

# Evaluate the model

from sklearn.metrics import accuracy_score, precision_score, recall_score
print(accuracy_score(emails_new['spam'], predictions ))
print(precision_score(emails_new['spam'], predictions))
print(recall_score(emails_new['spam'], predictions))

