# cafeto-training
Training repo to learn git and some other stuff

# Tasks

Create a fork of this repo in your own account, after that, create a Factory that manages a
singleton that internally will have a IDataAccess class as an attribute. Remember to add documentation and try to
make readable code. After making this, you have to add unit test to these created classes.
Lastly, you must do a pull request to this repo, so we can make you a code review of your code.

Some observations:
Think of the IDataAccess as an object that your singleton has to manage, the singleton must have internally an attribute of type IDataAccess. We don't provide an implementation of this interface since it is not necessary for the scope of this project. You only problem is that the singleton must manage an instance of IDataAccess and that's all.

You should make two implementations of this singleton, one, following the enum idea, and the second one, using a class.
