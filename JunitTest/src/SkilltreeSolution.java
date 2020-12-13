class SkilltreeSolution {
	public static int solution(String skill, String[] skill_trees) {
		// TODO Auto-generated method stub
		String[] skillArray = skill.split("");
		int returnValue = 0;
		String wholeSkill = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(String item : skillArray) {
			wholeSkill = wholeSkill.replaceAll(item, "");
		}
		String[] convertSkillTrees = skill_trees;
		for(int s = 0; s < convertSkillTrees.length; s++) {
			for(int i = 0; i < wholeSkill.length(); i++) {
				String compareString = wholeSkill.charAt(i)+"";
				if(convertSkillTrees[s].contains(compareString)) {
					convertSkillTrees[s] = convertSkillTrees[s].replaceAll(compareString, "");
				}
			}
			if (skill.indexOf(convertSkillTrees[s]) == 0) {
				returnValue++;
			}
		}
		return returnValue;
	}
}